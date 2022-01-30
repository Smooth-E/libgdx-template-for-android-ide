package com.example.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameSuperClass extends ApplicationAdapter {

    SpriteBatch spriteBatch;  // Used to draw sprite and textures onto the screen
    Texture texture;          // Texture, that will be drawn to a screen

    /* This method is being called when application is created */
    @Override
    public void create() {
        spriteBatch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("greetings.png"));
    }

    /* This method is being called once every frame */
    @Override
    public void render() {
        Gdx.gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        Gdx.gl.glClearColor(55 / 255f, 55 / 255f, 55 / 255f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        spriteBatch.begin();
        spriteBatch.draw(texture, (Gdx.graphics.getWidth() - Gdx.graphics.getHeight()) / 2f, 0,
                Gdx.graphics.getHeight(), Gdx.graphics.getHeight());
        spriteBatch.end();
    }

    /* This method is being called whenever the application is destroyed */
    @Override
    public void dispose() {
        spriteBatch.dispose();
        texture.dispose();
    }
}
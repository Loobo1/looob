import rat.poison.settings.*

/**
 * Whether or not to use V-sync (vertical sync) for the OpenGL overlay.
 *
 * Usually you want to use V-sync for the overlay if you use V-sync in game.
 */
OPENGL_VSYNC = false

/**
 * FPS of the OpenGL overlay
 */
OPENGL_FPS = 30

/**
 * The amount of MSAA antialiasing samples for the OpenGL overlay.
 *
 * Decreasing this number may help improve your FPS! Use 0 to disable.
 *
 * Valid sample amounts are 0 (disable), 2, 4, and 8.
 */
OPENGL_MSAA_SAMPLES = 0

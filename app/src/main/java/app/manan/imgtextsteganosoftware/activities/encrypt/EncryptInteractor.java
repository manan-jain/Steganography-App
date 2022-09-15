package app.manan.imgtextsteganosoftware.activities.encrypt;

import android.graphics.Bitmap;

interface EncryptInteractor {

  void performSteganography(String message, Bitmap coverImage, Bitmap secretImage);
}

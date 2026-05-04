package com.file;

import java.io.File;

/** Class xu ly duong dan file da he dieu hanh. */
public class PathHandler {

  /**
   * Tao duong dan file chuan dua tren tung he dieu hanh.
   *
   * @param folder ten thu muc
   * @param filename ten tep tin
   * @return duong dan hoan chinh
   */
  public String buildPath(String folder, String filename) {
    // Dung File.separator de tu dong thich nghi voi / (Linux/Mac) hoac \ (Windows)
    return folder + File.separator + filename;
  }
}
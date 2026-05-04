package com.file;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.File; // Import để sử dụng File.separator

public class PathHandlerTest {

  @Test
  public void testPathCrossPlatform() {
    PathHandler handler = new PathHandler();
    String folder = "data";
    String filename = "config.txt";
    
    String result = handler.buildPath(folder, filename);

    // Dùng File.separator để tự động thích nghi với dấu "/" hoặc "\" tùy hệ điều hành
    String expected = folder + File.separator + filename;
    
    assertEquals(expected, result, "Đường dẫn phải tương thích với mọi hệ điều hành trong Matrix");
  }
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: project.proto

package io.paddle.plugin.interop;

public interface AddPathsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.paddle.plugin.interop.AddPathsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string projectId = 1;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <code>string projectId = 1;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>repeated string paths = 2;</code>
   * @return A list containing the paths.
   */
  java.util.List<java.lang.String>
      getPathsList();
  /**
   * <code>repeated string paths = 2;</code>
   * @return The count of paths.
   */
  int getPathsCount();
  /**
   * <code>repeated string paths = 2;</code>
   * @param index The index of the element to return.
   * @return The paths at the given index.
   */
  java.lang.String getPaths(int index);
  /**
   * <code>repeated string paths = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the paths at the given index.
   */
  com.google.protobuf.ByteString
      getPathsBytes(int index);
}

//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: plugins.proto

package io.paddle.plugin.interop;

@kotlin.jvm.JvmSynthetic
public inline fun pyPackageInfo(block: io.paddle.plugin.interop.PyPackageInfoKt.Dsl.() -> kotlin.Unit): io.paddle.plugin.interop.PyPackageInfo =
  io.paddle.plugin.interop.PyPackageInfoKt.Dsl._create(io.paddle.plugin.interop.PyPackageInfo.newBuilder()).apply { block() }._build()
public object PyPackageInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.paddle.plugin.interop.PyPackageInfo.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.paddle.plugin.interop.PyPackageInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.paddle.plugin.interop.PyPackageInfo = _builder.build()

    /**
     * <code>string packageName = 1;</code>
     */
    public var packageName: kotlin.String
      @JvmName("getPackageName")
      get() = _builder.getPackageName()
      @JvmName("setPackageName")
      set(value) {
        _builder.setPackageName(value)
      }
    /**
     * <code>string packageName = 1;</code>
     */
    public fun clearPackageName() {
      _builder.clearPackageName()
    }

    /**
     * <code>string distributionUrl = 2;</code>
     */
    public var distributionUrl: kotlin.String
      @JvmName("getDistributionUrl")
      get() = _builder.getDistributionUrl()
      @JvmName("setDistributionUrl")
      set(value) {
        _builder.setDistributionUrl(value)
      }
    /**
     * <code>string distributionUrl = 2;</code>
     */
    public fun clearDistributionUrl() {
      _builder.clearDistributionUrl()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.paddle.plugin.interop.PyPackageInfo.copy(block: io.paddle.plugin.interop.PyPackageInfoKt.Dsl.() -> kotlin.Unit): io.paddle.plugin.interop.PyPackageInfo =
  io.paddle.plugin.interop.PyPackageInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()
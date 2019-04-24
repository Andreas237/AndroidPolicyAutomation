.class public Lorg/jivesoftware/smack/util/SystemUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PROPERTY_JAVA_VENDOR:Ljava/lang/String; = "java.vendor"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static onAndroid()Z
    .locals 2

    .line 24
    const-string v0, "java.vendor"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    const-string v0, "Android"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0

    .line 28
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

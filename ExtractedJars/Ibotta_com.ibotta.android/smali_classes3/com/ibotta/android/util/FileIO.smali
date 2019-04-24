.class public Lcom/ibotta/android/util/FileIO;
.super Ljava/lang/Object;
.source "FileIO.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public writeBytesToFile(Ljava/io/File;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    invoke-static {p1, p2}, Lorg/apache/commons/io/FileUtils;->writeByteArrayToFile(Ljava/io/File;[B)V

    return-void
.end method

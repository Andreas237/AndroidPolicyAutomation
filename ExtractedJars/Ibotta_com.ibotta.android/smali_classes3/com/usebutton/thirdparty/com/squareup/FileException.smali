.class public Lcom/usebutton/thirdparty/com/squareup/FileException;
.super Ljava/lang/RuntimeException;
.source "FileException.java"


# instance fields
.field private final file:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/IOException;Ljava/io/File;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    iput-object p3, p0, Lcom/usebutton/thirdparty/com/squareup/FileException;->file:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public getFile()Ljava/io/File;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileException;->file:Ljava/io/File;

    return-object v0
.end method

.class final Lnet/sqlcipher/database/SQLiteDatabase$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/sqlcipher/database/SQLiteDatabase$LibraryLoader;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/sqlcipher/database/SQLiteDatabase;->loadLibs(Landroid/content/Context;Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs loadLibraries([Ljava/lang/String;)V
    .locals 5

    .line 212
    move-object v1, p1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 213
    invoke-static {v4}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 212
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 215
    :cond_0
    return-void
.end method

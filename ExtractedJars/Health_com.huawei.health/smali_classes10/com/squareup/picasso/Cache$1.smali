.class final Lcom/squareup/picasso/Cache$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/picasso/Cache;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/picasso/Cache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 0

    .line 65
    return-void
.end method

.method public clearKeyUri(Ljava/lang/String;)V
    .locals 0

    .line 68
    return-void
.end method

.method public get(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 49
    const/4 v0, 0x0

    return-object v0
.end method

.method public maxSize()I
    .locals 1

    .line 61
    const/4 v0, 0x0

    return v0
.end method

.method public set(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 54
    return-void
.end method

.method public size()I
    .locals 1

    .line 57
    const/4 v0, 0x0

    return v0
.end method

.class final Lo/bbj$4;
.super Landroid/support/v4/util/LruCache;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bbj;->a(Lo/bbj$e;)Landroid/support/v4/util/LruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/util/LruCache<Ljava/lang/String;Landroid/graphics/drawable/Drawable;>;"
    }
.end annotation


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)I
    .locals 3

    .line 68
    invoke-static {p2}, Lo/bbj;->c(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    div-int/lit16 v2, v0, 0x400

    .line 69
    if-nez v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    return v0
.end method

.method public synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 65
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    move-object v1, p2

    check-cast v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0, v1}, Lo/bbj$4;->a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)I

    move-result v0

    return v0
.end method

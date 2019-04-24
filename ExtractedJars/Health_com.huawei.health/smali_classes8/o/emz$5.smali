.class Lo/emz$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/emz$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emz;->d(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/emz;

.field final synthetic d:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Lo/emz;Landroid/widget/ImageView;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lo/emz$5;->c:Lo/emz;

    iput-object p2, p0, Lo/emz$5;->d:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 203
    if-eqz p1, :cond_0

    .line 204
    invoke-static {p1}, Lo/dbk;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 205
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 206
    iget-object v0, p0, Lo/emz$5;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 209
    :cond_0
    return-void
.end method

.class Lo/ery$e$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ery$e;->e(ILandroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ery$e;


# direct methods
.method constructor <init>(Lo/ery$e;)V
    .locals 0

    .line 323
    iput-object p1, p0, Lo/ery$e$5;->e:Lo/ery$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 326
    if-eqz p2, :cond_0

    .line 327
    iget-object v0, p0, Lo/ery$e$5;->e:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->g(Lo/ery$e;)Landroid/widget/ImageView;

    move-result-object v0

    const-string v1, "#000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 329
    :cond_0
    return-void
.end method

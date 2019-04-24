.class Lo/bgq$a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgq$a;->a(ILandroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bgq$a;


# direct methods
.method constructor <init>(Lo/bgq$a;)V
    .locals 0

    .line 314
    iput-object p1, p0, Lo/bgq$a$3;->e:Lo/bgq$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 317
    if-eqz p2, :cond_0

    .line 318
    iget-object v0, p0, Lo/bgq$a$3;->e:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->i(Lo/bgq$a;)Landroid/widget/ImageView;

    move-result-object v0

    const-string v1, "#000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 320
    :cond_0
    return-void
.end method

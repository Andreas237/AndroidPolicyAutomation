.class Lo/bjy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bjy;->d(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bjy;


# direct methods
.method constructor <init>(Lo/bjy;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lo/bjy$1;->a:Lo/bjy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 169
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 170
    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    .line 174
    :sswitch_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 175
    iget-object v0, p0, Lo/bjy$1;->a:Lo/bjy;

    invoke-static {v0}, Lo/bjy;->a(Lo/bjy;)F

    move-result v0

    sub-float v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-int v4, v0

    .line 176
    const/16 v0, 0xa

    if-le v4, v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 177
    :goto_0
    if-nez v5, :cond_1

    .line 179
    iget-object v0, p0, Lo/bjy$1;->a:Lo/bjy;

    invoke-static {v0}, Lo/bjy;->b(Lo/bjy;)V

    goto :goto_1

    .line 185
    :sswitch_1
    iget-object v0, p0, Lo/bjy$1;->a:Lo/bjy;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-static {v0, v1}, Lo/bjy;->a(Lo/bjy;F)F

    .line 186
    .line 191
    :cond_1
    :goto_1
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

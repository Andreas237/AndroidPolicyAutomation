.class Lo/bmx$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bmx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lo/bmx;


# direct methods
.method private constructor <init>(Lo/bmx;)V
    .locals 0

    .line 565
    iput-object p1, p0, Lo/bmx$c;->d:Lo/bmx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bmx;Lo/bmx$4;)V
    .locals 0

    .line 565
    invoke-direct {p0, p1}, Lo/bmx$c;-><init>(Lo/bmx;)V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 571
    iget-object v0, p0, Lo/bmx$c;->d:Lo/bmx;

    invoke-static {v0}, Lo/bmx;->e(Lo/bmx;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 573
    const/4 v0, 0x1

    return v0

    .line 575
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

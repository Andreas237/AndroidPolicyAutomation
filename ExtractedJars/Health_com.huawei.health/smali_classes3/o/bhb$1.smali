.class Lo/bhb$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bhb;->e(Lo/bfh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ayh;

.field final synthetic e:Lo/bhb;


# direct methods
.method constructor <init>(Lo/bhb;Lo/ayh;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lo/bhb$1;->e:Lo/bhb;

    iput-object p2, p0, Lo/bhb$1;->c:Lo/ayh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 141
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 143
    iget-object v0, p0, Lo/bhb$1;->e:Lo/bhb;

    iget-object v1, p0, Lo/bhb$1;->c:Lo/ayh;

    invoke-static {v0, v1}, Lo/bhb;->d(Lo/bhb;Lo/ayh;)V

    .line 145
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

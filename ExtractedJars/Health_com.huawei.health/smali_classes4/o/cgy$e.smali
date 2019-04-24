.class Lo/cgy$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amap/api/maps/AMap$OnMapTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/cgy;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/cgy;)V
    .locals 1

    .line 1750
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1751
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/cgy$e;->e:Ljava/lang/ref/WeakReference;

    .line 1752
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1755
    iget-object v0, p0, Lo/cgy$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/cgy;

    .line 1756
    if-eqz v1, :cond_0

    .line 1757
    invoke-virtual {v1}, Lo/cgy;->e()V

    .line 1759
    :cond_0
    return-void
.end method

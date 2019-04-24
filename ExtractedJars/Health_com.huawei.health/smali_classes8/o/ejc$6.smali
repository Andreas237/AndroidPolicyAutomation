.class Lo/ejc$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ejc;->d(Landroid/view/MotionEvent;FZ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ejc;


# direct methods
.method constructor <init>(Lo/ejc;)V
    .locals 0

    .line 364
    iput-object p1, p0, Lo/ejc$6;->c:Lo/ejc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(F)F
    .locals 2

    .line 367
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, p1

    mul-float v1, p1, p1

    sub-float/2addr v0, v1

    return v0
.end method

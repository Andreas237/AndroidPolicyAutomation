.class Lo/cgy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amap/api/maps/AMap$CancelableCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cgy;


# direct methods
.method constructor <init>(Lo/cgy;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/cgy$3;->c:Lo/cgy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 0

    .line 114
    return-void
.end method

.method public onFinish()V
    .locals 2

    .line 110
    iget-object v0, p0, Lo/cgy$3;->c:Lo/cgy;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cgy;->b(Lo/cgy;Z)Z

    .line 111
    return-void
.end method

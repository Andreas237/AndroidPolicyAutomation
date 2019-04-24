.class Lo/cyj$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cyj$1;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cyj$1;


# direct methods
.method constructor <init>(Lo/cyj$1;)V
    .locals 0

    .line 1221
    iput-object p1, p0, Lo/cyj$1$1;->c:Lo/cyj$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1224
    iget-object v0, p0, Lo/cyj$1$1;->c:Lo/cyj$1;

    iget-object v0, v0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->m(Lo/cyj;)V

    .line 1225
    return-void
.end method

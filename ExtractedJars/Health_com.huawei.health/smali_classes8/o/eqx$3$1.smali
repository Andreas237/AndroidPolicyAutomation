.class Lo/eqx$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eqx$3;->onChange(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eqx$3;


# direct methods
.method constructor <init>(Lo/eqx$3;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lo/eqx$3$1;->a:Lo/eqx$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 138
    iget-object v0, p0, Lo/eqx$3$1;->a:Lo/eqx$3;

    iget-object v0, v0, Lo/eqx$3;->c:Lo/eqx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/eqx;->c(Lo/eqx;Z)Z

    .line 139
    iget-object v0, p0, Lo/eqx$3$1;->a:Lo/eqx$3;

    iget-object v0, v0, Lo/eqx$3;->c:Lo/eqx;

    invoke-static {v0}, Lo/eqx;->d(Lo/eqx;)V

    .line 140
    return-void
.end method

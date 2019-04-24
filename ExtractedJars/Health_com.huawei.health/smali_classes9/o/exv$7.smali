.class Lo/exv$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exv;->e(Lcom/huawei/hihealth/data/model/HiStressMetaData;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exv;

.field final synthetic c:Lo/egg;


# direct methods
.method constructor <init>(Lo/exv;Lo/egg;)V
    .locals 0

    .line 1154
    iput-object p1, p0, Lo/exv$7;->a:Lo/exv;

    iput-object p2, p0, Lo/exv$7;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 1

    .line 1157
    iget-object v0, p0, Lo/exv$7;->c:Lo/egg;

    if-eqz v0, :cond_0

    .line 1158
    iget-object v0, p0, Lo/exv$7;->c:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1160
    :cond_0
    return-void
.end method

.class Lo/eob$11;
.super Lo/djw$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eob;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eob;


# direct methods
.method constructor <init>(Lo/eob;)V
    .locals 0

    .line 1098
    iput-object p1, p0, Lo/eob$11;->b:Lo/eob;

    invoke-direct {p0}, Lo/djw$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1101
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0, p1}, Lo/eob;->d(Lo/eob;I)I

    .line 1102
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->h(Lo/eob;)Lo/djw$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1103
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFileTransferState,null != mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1104
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->h(Lo/eob;)Lo/djw$d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/djw$d;->b(I)V

    goto :goto_0

    .line 1106
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFileTransferState,null == mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1108
    :goto_0
    return-void
.end method

.method public e(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1126
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/eob;->d(Lo/eob;I)I

    .line 1128
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    const/16 v1, 0xc

    iput v1, v0, Lo/eob;->o:I

    .line 1129
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->k(Lo/eob;)V

    .line 1130
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->m(Lo/eob;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1131
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->m(Lo/eob;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1133
    :cond_0
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0, p1}, Lo/eob;->e(Lo/eob;I)I

    .line 1134
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->i(Lo/eob;)V

    .line 1135
    if-eqz p1, :cond_1

    .line 1136
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eob;->d(Ljava/lang/Boolean;)V

    .line 1137
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1138
    const-string v0, "product_type"

    iget-object v1, p0, Lo/eob$11;->b:Lo/eob;

    iget v1, v1, Lo/eob;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1139
    const-string v0, "status"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1140
    sget-object v0, Lo/dae;->jo:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1141
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1142
    goto :goto_0

    .line 1143
    :cond_1
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eob;->d(Ljava/lang/Boolean;)V

    .line 1145
    :goto_0
    return-void
.end method

.method public e(ILjava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1112
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/eob;->d(Lo/eob;I)I

    .line 1113
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eob;->e(Ljava/lang/Boolean;)V

    .line 1114
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->i(Lo/eob;)V

    .line 1115
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eob;->d(Ljava/lang/Boolean;)V

    .line 1116
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->h(Lo/eob;)Lo/djw$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1117
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgradeFailed,null != mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1118
    iget-object v0, p0, Lo/eob$11;->b:Lo/eob;

    invoke-static {v0}, Lo/eob;->h(Lo/eob;)Lo/djw$d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/djw$d;->e(ILjava/lang/String;)V

    goto :goto_0

    .line 1120
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgradeFailed,null == mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1122
    :goto_0
    return-void
.end method

.class Lo/akt$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dnd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/akt;


# direct methods
.method constructor <init>(Lo/akt;)V
    .locals 0

    .line 809
    iput-object p1, p0, Lo/akt$8;->d:Lo/akt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 812
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/aks;->m(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 813
    return-void
.end method

.method public a()Z
    .locals 1

    .line 822
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->i()Z

    move-result v0

    return v0
.end method

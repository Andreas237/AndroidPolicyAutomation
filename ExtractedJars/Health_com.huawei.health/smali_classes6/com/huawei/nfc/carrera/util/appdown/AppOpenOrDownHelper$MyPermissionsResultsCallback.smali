.class Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$MyPermissionsResultsCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsx$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyPermissionsResultsCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;


# direct methods
.method private constructor <init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$MyPermissionsResultsCallback;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;)V
    .locals 0

    .line 155
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$MyPermissionsResultsCallback;-><init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    return-void
.end method


# virtual methods
.method public onRequestPermissionsResult([I)V
    .locals 3

    .line 160
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p1, v0

    if-nez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 163
    :goto_0
    if-eqz v2, :cond_1

    .line 165
    const-string v0, "AppOpenOrDownHelper down apk write sdcard have permission, start down."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$MyPermissionsResultsCallback;->this$0:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$400(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    goto :goto_1

    .line 171
    :cond_1
    const-string v0, "AppOpenOrDownHelper down apk write sdcard have not permission"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 173
    :goto_1
    return-void
.end method

.class Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->getUrlMapFromGrs(Ljava/lang/String;Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

.field final synthetic val$callBack:Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;

.field final synthetic val$serviceCountryCode:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;Ljava/lang/String;Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->val$serviceCountryCode:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->val$callBack:Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 137
    iget-object v3, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->val$serviceCountryCode:Ljava/lang/String;

    .line 138
    const-string v0, "OverSeasManager getUrlMapFromGrs BEGIN."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$000(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 141
    const-string v0, "OverSeasManager getUrlMapFromGrs no need Init Grs."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 142
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->val$callBack:Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;

    const-string v1, "00"

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;->finish(Ljava/lang/String;)V

    .line 143
    return-void

    .line 146
    :cond_0
    invoke-static {}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$100()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 148
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    invoke-static {v0, v3}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$000(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 150
    const-string v0, "OverSeasManager getUrlMapFromGrs no need Init Grs in sync."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 151
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->val$callBack:Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;

    const-string v1, "00"

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;->finish(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    monitor-exit v4

    return-void

    .line 156
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    invoke-static {}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$100()Ljava/lang/Object;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 159
    const-string v0, ""

    move-object v3, v0

    goto :goto_0

    .line 165
    :cond_2
    goto :goto_1

    .line 162
    :catch_0
    move-exception v5

    .line 164
    const-string v0, "OverSeasManager wait InterruptedException."

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 167
    :goto_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 168
    new-instance v6, Lo/zs;

    invoke-direct {v6}, Lo/zs;-><init>()V

    .line 169
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$200(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/zs;->b(Ljava/lang/String;)V

    .line 170
    invoke-virtual {v6, v3}, Lo/zs;->a(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$300(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Lo/yx;->b(Landroid/content/Context;Lo/zs;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$400(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/yx;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    .line 174
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 176
    invoke-interface {v5, v7}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 179
    :cond_3
    const-string v0, "com.huawei.cloud.agreementservice"

    const-string v1, "ROOT"

    invoke-static {v0, v1}, Lo/yx;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 181
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 183
    const-string v0, "GREMENT"

    invoke-interface {v5, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    :cond_4
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 188
    const-string v0, "OverSeasManager getUrlMapFromGrs bad, get url map empty."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    goto :goto_2

    .line 193
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$502(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;Ljava/util/Map;)Ljava/util/Map;

    .line 194
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$300(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/nfc/carrera/server/overseas/storage/OverSeasPreferences;->putMap(Ljava/util/Map;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->this$0:Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->access$300(Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/wallet/storage/sp/AccountPreferences;->b(Landroid/content/Context;)Lcom/huawei/wallet/storage/sp/AccountPreferences;

    move-result-object v0

    const-string v1, "account_service_country_code"

    invoke-virtual {v0, v1, v3}, Lcom/huawei/wallet/storage/sp/AccountPreferences;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 196
    const-string v0, "OverSeasManager getUrlMapFromGrs god, get url map not empty."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 198
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OverSeasManager getUrlMapFromGrs END.urlMap is empty :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 199
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager$1;->val$callBack:Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;

    const-string v1, "00"

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/server/overseas/InitGrsResultCallBack;->finish(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 200
    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9

    .line 201
    :goto_3
    return-void
.end method

.class Lcom/shopkick/fetchers/api/APIManager$1;
.super Ljava/lang/Object;
.source "APIManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/fetchers/api/APIManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/fetchers/api/APIManager;


# direct methods
.method constructor <init>(Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public updateServerToken(Ljava/lang/String;Ljava/lang/String;[BI)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    .line 299
    iget-object p4, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-static {p4}, Lcom/shopkick/fetchers/api/APIManager;->access$000(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/Account;

    move-result-object p4

    if-eqz p4, :cond_2

    iget-object p4, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-static {p4}, Lcom/shopkick/fetchers/api/APIManager;->access$000(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/Account;

    move-result-object p4

    invoke-virtual {p4}, Lcom/shopkick/app/application/Account;->accountExists()Z

    move-result p4

    if-eqz p4, :cond_2

    .line 302
    iget-object p4, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-static {p4}, Lcom/shopkick/fetchers/api/APIManager;->access$000(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/Account;

    move-result-object p4

    invoke-virtual {p4}, Lcom/shopkick/app/application/Account;->getSessionKey()[B

    move-result-object p4

    invoke-static {p4, p2, p1, p3}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getHmacString([BLjava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    if-ne p4, v0, :cond_1

    .line 310
    iget-object p4, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-static {p4}, Lcom/shopkick/fetchers/api/APIManager;->access$100(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/DeveloperInfo;

    move-result-object p4

    invoke-virtual {p4}, Lcom/shopkick/app/application/DeveloperInfo;->getInfo()[B

    move-result-object p4

    invoke-static {p4, p2, p1, p3}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getHmacString([BLjava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 311
    :cond_1
    iget-object p4, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-static {p4}, Lcom/shopkick/fetchers/api/APIManager;->access$200(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/AppInfo;

    move-result-object p4

    if-eqz p4, :cond_2

    .line 314
    iget-object p4, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-static {p4}, Lcom/shopkick/fetchers/api/APIManager;->access$200(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/AppInfo;

    move-result-object p4

    invoke-virtual {p4}, Lcom/shopkick/app/application/AppInfo;->getInfo()[B

    move-result-object p4

    invoke-static {p4, p2, p1, p3}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getHmacString([BLjava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    .line 318
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_3

    iget-object p3, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p3, p3, Lcom/shopkick/fetchers/api/APIManager;->serverToken:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    .line 319
    iget-object p3, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p1, p3, Lcom/shopkick/fetchers/api/APIManager;->serverToken:Ljava/lang/String;

    .line 320
    invoke-static {p3}, Lcom/shopkick/fetchers/api/APIManager;->access$300(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/LibPreferences;

    move-result-object p3

    if-eqz p3, :cond_3

    .line 321
    iget-object p3, p0, Lcom/shopkick/fetchers/api/APIManager$1;->this$0:Lcom/shopkick/fetchers/api/APIManager;

    invoke-static {p3}, Lcom/shopkick/fetchers/api/APIManager;->access$300(Lcom/shopkick/fetchers/api/APIManager;)Lcom/shopkick/app/application/LibPreferences;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/shopkick/app/application/LibPreferences;->setAPIManagerToken(Ljava/lang/String;)V

    :cond_3
    return-object p2
.end method

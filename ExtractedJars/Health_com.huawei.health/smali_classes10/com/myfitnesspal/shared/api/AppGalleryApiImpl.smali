.class public Lcom/myfitnesspal/shared/api/AppGalleryApiImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/myfitnesspal/shared/api/AppGalleryApi;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public revokeAccess(Ljava/lang/String;)V
    .locals 6

    .line 22
    const-string v0, "http://www.myfitnesspal.com"

    const-string v1, "/oauth2/revoke"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "refresh_token"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/myfitnesspal/shared/utils/UriUtils;->createUrl(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 24
    const-string v0, "revokeAccess: %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 25
    invoke-static {v5}, Lcom/myfitnesspal/shared/utils/HttpUtils;->makeGetRequest(Ljava/lang/String;)Z

    .line 26
    return-void
.end method

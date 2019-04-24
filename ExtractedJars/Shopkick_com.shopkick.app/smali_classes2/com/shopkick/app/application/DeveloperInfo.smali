.class public Lcom/shopkick/app/application/DeveloperInfo;
.super Ljava/lang/Object;
.source "DeveloperInfo.java"


# static fields
.field public static final SHOPKICK_API_KEY:Ljava/lang/String; = "0e8450ff-351e-406d-a365-03f735f87d9f"

.field public static final SHOPKICK_APP_SECRET:Ljava/lang/String; = "b45db75a53fc2d9c5972c4377030cd1a71240efa"


# instance fields
.field private final apiKey:Ljava/lang/String;

.field private final appInfo:[B


# direct methods
.method public constructor <init>([BLjava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/shopkick/app/application/DeveloperInfo;->appInfo:[B

    .line 16
    iput-object p2, p0, Lcom/shopkick/app/application/DeveloperInfo;->apiKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getApiKey()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/shopkick/app/application/DeveloperInfo;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public getInfo()[B
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/shopkick/app/application/DeveloperInfo;->appInfo:[B

    return-object v0
.end method

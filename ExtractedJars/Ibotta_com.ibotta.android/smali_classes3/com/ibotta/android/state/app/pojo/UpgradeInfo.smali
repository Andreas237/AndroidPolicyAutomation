.class public Lcom/ibotta/android/state/app/pojo/UpgradeInfo;
.super Ljava/lang/Object;
.source "UpgradeInfo.java"


# instance fields
.field private final newVersion:Ljava/lang/String;

.field private final oldVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/state/app/pojo/UpgradeInfo;->oldVersion:Ljava/lang/String;

    .line 14
    iput-object p2, p0, Lcom/ibotta/android/state/app/pojo/UpgradeInfo;->newVersion:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getNewVersion()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/state/app/pojo/UpgradeInfo;->newVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getOldVersion()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/ibotta/android/state/app/pojo/UpgradeInfo;->oldVersion:Ljava/lang/String;

    return-object v0
.end method

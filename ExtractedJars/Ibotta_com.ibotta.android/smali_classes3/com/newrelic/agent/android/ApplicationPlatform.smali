.class public final enum Lcom/newrelic/agent/android/ApplicationPlatform;
.super Ljava/lang/Enum;
.source "ApplicationPlatform.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/ApplicationPlatform;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/ApplicationPlatform;

.field public static final enum Appcelerator:Lcom/newrelic/agent/android/ApplicationPlatform;

.field public static final enum Cordova:Lcom/newrelic/agent/android/ApplicationPlatform;

.field public static final enum Native:Lcom/newrelic/agent/android/ApplicationPlatform;

.field public static final enum PhoneGap:Lcom/newrelic/agent/android/ApplicationPlatform;

.field public static final enum React:Lcom/newrelic/agent/android/ApplicationPlatform;

.field public static final enum Unity:Lcom/newrelic/agent/android/ApplicationPlatform;

.field public static final enum Xamarin:Lcom/newrelic/agent/android/ApplicationPlatform;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 4
    new-instance v0, Lcom/newrelic/agent/android/ApplicationPlatform;

    const-string v1, "Native"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/ApplicationPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->Native:Lcom/newrelic/agent/android/ApplicationPlatform;

    .line 5
    new-instance v0, Lcom/newrelic/agent/android/ApplicationPlatform;

    const-string v1, "Cordova"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/newrelic/agent/android/ApplicationPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->Cordova:Lcom/newrelic/agent/android/ApplicationPlatform;

    .line 6
    new-instance v0, Lcom/newrelic/agent/android/ApplicationPlatform;

    const-string v1, "PhoneGap"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/newrelic/agent/android/ApplicationPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->PhoneGap:Lcom/newrelic/agent/android/ApplicationPlatform;

    .line 7
    new-instance v0, Lcom/newrelic/agent/android/ApplicationPlatform;

    const-string v1, "Xamarin"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/newrelic/agent/android/ApplicationPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->Xamarin:Lcom/newrelic/agent/android/ApplicationPlatform;

    .line 8
    new-instance v0, Lcom/newrelic/agent/android/ApplicationPlatform;

    const-string v1, "Unity"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/newrelic/agent/android/ApplicationPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->Unity:Lcom/newrelic/agent/android/ApplicationPlatform;

    .line 9
    new-instance v0, Lcom/newrelic/agent/android/ApplicationPlatform;

    const-string v1, "Appcelerator"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/newrelic/agent/android/ApplicationPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->Appcelerator:Lcom/newrelic/agent/android/ApplicationPlatform;

    .line 10
    new-instance v0, Lcom/newrelic/agent/android/ApplicationPlatform;

    const-string v1, "React"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/newrelic/agent/android/ApplicationPlatform;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->React:Lcom/newrelic/agent/android/ApplicationPlatform;

    const/4 v0, 0x7

    .line 3
    new-array v0, v0, [Lcom/newrelic/agent/android/ApplicationPlatform;

    sget-object v1, Lcom/newrelic/agent/android/ApplicationPlatform;->Native:Lcom/newrelic/agent/android/ApplicationPlatform;

    aput-object v1, v0, v2

    sget-object v1, Lcom/newrelic/agent/android/ApplicationPlatform;->Cordova:Lcom/newrelic/agent/android/ApplicationPlatform;

    aput-object v1, v0, v3

    sget-object v1, Lcom/newrelic/agent/android/ApplicationPlatform;->PhoneGap:Lcom/newrelic/agent/android/ApplicationPlatform;

    aput-object v1, v0, v4

    sget-object v1, Lcom/newrelic/agent/android/ApplicationPlatform;->Xamarin:Lcom/newrelic/agent/android/ApplicationPlatform;

    aput-object v1, v0, v5

    sget-object v1, Lcom/newrelic/agent/android/ApplicationPlatform;->Unity:Lcom/newrelic/agent/android/ApplicationPlatform;

    aput-object v1, v0, v6

    sget-object v1, Lcom/newrelic/agent/android/ApplicationPlatform;->Appcelerator:Lcom/newrelic/agent/android/ApplicationPlatform;

    aput-object v1, v0, v7

    sget-object v1, Lcom/newrelic/agent/android/ApplicationPlatform;->React:Lcom/newrelic/agent/android/ApplicationPlatform;

    aput-object v1, v0, v8

    sput-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->$VALUES:[Lcom/newrelic/agent/android/ApplicationPlatform;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/ApplicationPlatform;
    .locals 1

    .line 3
    const-class v0, Lcom/newrelic/agent/android/ApplicationPlatform;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/ApplicationPlatform;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/ApplicationPlatform;
    .locals 1

    .line 3
    sget-object v0, Lcom/newrelic/agent/android/ApplicationPlatform;->$VALUES:[Lcom/newrelic/agent/android/ApplicationPlatform;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/ApplicationPlatform;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/ApplicationPlatform;

    return-object v0
.end method

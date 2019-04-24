.class public Lcom/ibotta/android/logging/IbottaLogger;
.super Ljava/lang/Object;
.source "IbottaLogger.java"


# static fields
.field public static Log:Lcom/ibotta/android/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Lcom/ibotta/android/logging/IbottaLogger$1;

    invoke-direct {v0}, Lcom/ibotta/android/logging/IbottaLogger$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static initLogger(Lcom/ibotta/android/logging/Logger;)V
    .locals 0

    .line 7
    sput-object p0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    return-void
.end method

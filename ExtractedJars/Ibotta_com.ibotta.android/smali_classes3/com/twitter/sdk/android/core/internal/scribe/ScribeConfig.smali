.class public Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;
.super Ljava/lang/Object;
.source "ScribeConfig.java"


# instance fields
.field public final baseUrl:Ljava/lang/String;

.field public final isEnabled:Z

.field public final maxFilesToKeep:I

.field public final pathType:Ljava/lang/String;

.field public final pathVersion:Ljava/lang/String;

.field public final sendIntervalSeconds:I

.field public final sequence:Ljava/lang/String;

.field public final userAgent:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-boolean p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->isEnabled:Z

    .line 63
    iput-object p2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->baseUrl:Ljava/lang/String;

    .line 64
    iput-object p3, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->pathVersion:Ljava/lang/String;

    .line 65
    iput-object p4, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->pathType:Ljava/lang/String;

    .line 66
    iput-object p5, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->sequence:Ljava/lang/String;

    .line 67
    iput-object p6, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->userAgent:Ljava/lang/String;

    .line 68
    iput p7, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->maxFilesToKeep:I

    .line 69
    iput p8, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->sendIntervalSeconds:I

    return-void
.end method

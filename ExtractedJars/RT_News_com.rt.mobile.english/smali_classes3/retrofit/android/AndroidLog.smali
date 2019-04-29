.class public Lretrofit/android/AndroidLog;
.super Ljava/lang/Object;
.source "AndroidLog.java"

# interfaces
.implements Lretrofit/RestAdapter$Log;


# static fields
.field private static final LOG_CHUNK_SIZE:I = 0xfa0


# instance fields
.field private final tag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lretrofit/android/AndroidLog;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getTag()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lretrofit/android/AndroidLog;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final log(Ljava/lang/String;)V
    .locals 4

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int/lit16 v2, v1, 0xfa0

    .line 18
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 19
    invoke-virtual {p1, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lretrofit/android/AndroidLog;->logChunk(Ljava/lang/String;)V

    move v1, v2

    goto :goto_0

    :cond_0
    return-void
.end method

.method public logChunk(Ljava/lang/String;)V
    .locals 1

    .line 28
    invoke-virtual {p0}, Lretrofit/android/AndroidLog;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

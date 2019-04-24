.class public Lcom/huawei/common/applog/AppLogApi$LogLevel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/common/applog/AppLogApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LogLevel"
.end annotation


# static fields
.field public static final DEBUG:I = 0x1

.field public static final ERROR:I = 0x4

.field public static final INFO:I = 0x2

.field public static final SILENT:I = 0x5

.field public static final VERBOSE:I = 0x0

.field public static final WARN:I = 0x3


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1019
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

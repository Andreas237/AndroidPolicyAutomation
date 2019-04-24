.class public Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable$AuthorityStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/model/HealthOpenContactTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AuthorityStatus"
.end annotation


# static fields
.field public static final AUTHORITY_INVALID:I = 0x4

.field public static final AUTHORITY_NOT_DETERMINDED:I = 0x0

.field public static final AUTHORITY_ONLY_READ:I = 0x1

.field public static final AUTHORITY_ONLY_SHARE:I = 0x2

.field public static final AUTHORITY_READ_AND_SHARE:I = 0x3


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

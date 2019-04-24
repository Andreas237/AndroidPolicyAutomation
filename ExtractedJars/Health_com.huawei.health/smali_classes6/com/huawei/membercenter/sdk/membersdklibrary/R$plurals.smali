.class public final Lcom/huawei/membercenter/sdk/membersdklibrary/R$plurals;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/membercenter/sdk/membersdklibrary/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "plurals"
.end annotation


# static fields
.field public static membersdk_growth_subhead:I

.field public static membersdk_upgrade_subhead:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    const/high16 v0, 0x7f030000

    sput v0, Lcom/huawei/membercenter/sdk/membersdklibrary/R$plurals;->membersdk_growth_subhead:I

    .line 15
    const v0, 0x7f030001

    sput v0, Lcom/huawei/membercenter/sdk/membersdklibrary/R$plurals;->membersdk_upgrade_subhead:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

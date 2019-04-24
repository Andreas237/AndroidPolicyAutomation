.class public final Lcom/huawei/hihealthservice/old/model/Weight$Level;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/model/Weight;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Level"
.end annotation


# static fields
.field public static final INVALID:S = -0x8000s

.field public static final NORMALWEIGHT:S = 0x4s

.field public static final OBESITY:S = 0x6s

.field public static final OVERWEIGHT:S = 0x5s

.field public static final TOOLIGHT:S = 0x2s

.field public static final UNDERWEIGHT:S = 0x3s


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

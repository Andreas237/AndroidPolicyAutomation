.class public final Lcom/huawei/hihealthservice/old/util/Constants$LOCALE;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/util/Constants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LOCALE"
.end annotation


# static fields
.field public static final DEFAULT_LOCALE:Ljava/util/Locale;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 89
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    sput-object v0, Lcom/huawei/hihealthservice/old/util/Constants$LOCALE;->DEFAULT_LOCALE:Ljava/util/Locale;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

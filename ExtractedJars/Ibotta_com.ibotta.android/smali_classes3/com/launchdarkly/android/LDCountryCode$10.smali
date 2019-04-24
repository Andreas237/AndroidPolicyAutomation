.class final enum Lcom/launchdarkly/android/LDCountryCode$10;
.super Lcom/launchdarkly/android/LDCountryCode;
.source "LDCountryCode.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/LDCountryCode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILcom/launchdarkly/android/LDCountryCode$Assignment;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    .line 1887
    invoke-direct/range {v0 .. v7}, Lcom/launchdarkly/android/LDCountryCode;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILcom/launchdarkly/android/LDCountryCode$Assignment;Lcom/launchdarkly/android/LDCountryCode$1;)V

    return-void
.end method


# virtual methods
.method public toLocale()Ljava/util/Locale;
    .locals 1

    .line 1890
    sget-object v0, Ljava/util/Locale;->UK:Ljava/util/Locale;

    return-object v0
.end method

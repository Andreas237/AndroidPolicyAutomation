.class public final Lcom/newrelic/agent/android/util/Constants$Network$ContentType;
.super Ljava/lang/Object;
.source "Constants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/util/Constants$Network;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ContentType"
.end annotation


# static fields
.field public static final JSON:Ljava/lang/String; = "application/json"

.field public static final OCTET_STREAM:Ljava/lang/String; = "application/octet-stream"

.field public static final URL_ENCODED:Ljava/lang/String; = "application/x-www-form-urlencoded"


# instance fields
.field final synthetic this$1:Lcom/newrelic/agent/android/util/Constants$Network;


# direct methods
.method private constructor <init>(Lcom/newrelic/agent/android/util/Constants$Network;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/newrelic/agent/android/util/Constants$Network$ContentType;->this$1:Lcom/newrelic/agent/android/util/Constants$Network;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.class public final Lcom/newrelic/agent/android/util/Constants$Network;
.super Ljava/lang/Object;
.source "Constants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/util/Constants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Network"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/util/Constants$Network$ContentType;
    }
.end annotation


# static fields
.field public static final APPLICATION_ID_HEADER:Ljava/lang/String; = "X-APPLICATION-ID"

.field public static final APPLICATION_LICENSE_HEADER:Ljava/lang/String; = "X-App-License-Key"

.field public static final APP_DATA_HEADER:Ljava/lang/String; = "X-NewRelic-App-Data"

.field public static final APP_VERSION_HEADER:Ljava/lang/String; = "X-NewRelic-App-Version"

.field public static final CONNECTIVITY_TRACE_HEADER:Ljava/lang/String; = "newrelic"

.field public static final CONNECT_TIME_HEADER:Ljava/lang/String; = "X-NewRelic-Connect-Time"

.field public static final CONTENT_ENCODING_HEADER:Ljava/lang/String; = "Content-Encoding"

.field public static final CONTENT_LENGTH_HEADER:Ljava/lang/String; = "Content-length"

.field public static final CONTENT_TYPE_HEADER:Ljava/lang/String; = "Content-Type"

.field public static final CROSS_PROCESS_ID_HEADER:Ljava/lang/String; = "X-NewRelic-ID"

.field public static final DEVICE_OS_NAME_HEADER:Ljava/lang/String; = "X-NewRelic-OS-Name"

.field public static final HOST_HEADER:Ljava/lang/String; = "Host"

.field public static final USER_AGENT_HEADER:Ljava/lang/String; = "User-Agent"


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/util/Constants;


# direct methods
.method private constructor <init>(Lcom/newrelic/agent/android/util/Constants;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/newrelic/agent/android/util/Constants$Network;->this$0:Lcom/newrelic/agent/android/util/Constants;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

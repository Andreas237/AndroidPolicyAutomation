.class public final Lcom/newrelic/agent/android/util/Constants$Transactions;
.super Ljava/lang/Object;
.source "Constants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/util/Constants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Transactions"
.end annotation


# static fields
.field public static final CONTENT_LENGTH:Ljava/lang/String; = "content_length"

.field public static final CONTENT_TYPE:Ljava/lang/String; = "content_type"


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/util/Constants;


# direct methods
.method public constructor <init>(Lcom/newrelic/agent/android/util/Constants;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/newrelic/agent/android/util/Constants$Transactions;->this$0:Lcom/newrelic/agent/android/util/Constants;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

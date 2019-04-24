.class public Lnet/hockeyapp/android/FeedbackManager;
.super Ljava/lang/Object;
.source "FeedbackManager.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static identifier:Ljava/lang/String; = null

.field private static lastListener:Lnet/hockeyapp/android/FeedbackManagerListener; = null

.field private static notificationActive:Z = false

.field private static receiver:Landroid/content/BroadcastReceiver;

.field private static requireUserEmail:Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

.field private static requireUserName:Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

.field private static urlString:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static getLastListener()Lnet/hockeyapp/android/FeedbackManagerListener;
    .locals 1

    .line 240
    sget-object v0, Lnet/hockeyapp/android/FeedbackManager;->lastListener:Lnet/hockeyapp/android/FeedbackManagerListener;

    return-object v0
.end method

.method public static getRequireUserEmail()Lnet/hockeyapp/android/objects/FeedbackUserDataElement;
    .locals 1

    .line 277
    sget-object v0, Lnet/hockeyapp/android/FeedbackManager;->requireUserEmail:Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

    return-object v0
.end method

.method public static getRequireUserName()Lnet/hockeyapp/android/objects/FeedbackUserDataElement;
    .locals 1

    .line 259
    sget-object v0, Lnet/hockeyapp/android/FeedbackManager;->requireUserName:Lnet/hockeyapp/android/objects/FeedbackUserDataElement;

    return-object v0
.end method

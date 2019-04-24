.class public interface abstract Lcom/shopkick/app/gcm/GCMConstants;
.super Ljava/lang/Object;
.source "GCMConstants.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/gcm/GCMConstants$GCMAction;
    }
.end annotation


# static fields
.field public static final GCM_Channel_ID:Ljava/lang/String; = "GCMChannel"

.field public static final GCM_INTENT_ACTION:Ljava/lang/String; = "com.shopkick.app.gcm.action"

.field public static final GCM_INTENT_BROADCAST:Ljava/lang/String; = "com.shopkick.app.gcm.intent"

.field public static final GCM_INTENT_REGISTRATION_ID:Ljava/lang/String; = "registration_id"

.field public static final GCM_SENDER_IDS:[Ljava/lang/String;

.field public static final SHOPKICK_SENDER_ID:Ljava/lang/String; = "31007554452"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "31007554452"

    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/gcm/GCMConstants;->GCM_SENDER_IDS:[Ljava/lang/String;

    return-void
.end method

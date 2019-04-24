.class public interface abstract Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;
.super Ljava/lang/Object;
.source "AlertMessageViewEvents.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewEvents;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0003H&J\u0008\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;",
        "Lcom/ibotta/android/views/components/ViewEvents;",
        "onDismissTapped",
        "",
        "onNegativeTapped",
        "onPositiveTapped",
        "Companion",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final Companion:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;->$$INSTANCE:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;

    sput-object v0, Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents;->Companion:Lcom/ibotta/android/views/messages/alert/AlertMessageViewEvents$Companion;

    return-void
.end method


# virtual methods
.method public abstract onDismissTapped()V
.end method

.method public abstract onNegativeTapped()V
.end method

.method public abstract onPositiveTapped()V
.end method

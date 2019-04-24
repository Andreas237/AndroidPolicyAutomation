.class public interface abstract Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;
.super Ljava/lang/Object;
.source "SemiModalViewEvents.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewEvents;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008f\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;",
        "Lcom/ibotta/android/views/components/ViewEvents;",
        "onNegativeTapped",
        "",
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
.field public static final Companion:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;->$$INSTANCE:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;

    sput-object v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;->Companion:Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents$Companion;

    return-void
.end method


# virtual methods
.method public abstract onNegativeTapped()V
.end method

.method public abstract onPositiveTapped()V
.end method

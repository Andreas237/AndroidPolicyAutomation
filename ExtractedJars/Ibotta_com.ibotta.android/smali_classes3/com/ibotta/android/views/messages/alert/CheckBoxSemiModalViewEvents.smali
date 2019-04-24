.class public interface abstract Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;
.super Ljava/lang/Object;
.source "CheckBoxSemiModalViewEvents.kt"

# interfaces
.implements Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewEvents;",
        "onCheckBoxTapped",
        "",
        "isChecked",
        "",
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
.field public static final Companion:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents$Companion;->$$INSTANCE:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents$Companion;

    sput-object v0, Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents;->Companion:Lcom/ibotta/android/views/messages/alert/CheckBoxSemiModalViewEvents$Companion;

    return-void
.end method


# virtual methods
.method public abstract onCheckBoxTapped(Z)V
.end method

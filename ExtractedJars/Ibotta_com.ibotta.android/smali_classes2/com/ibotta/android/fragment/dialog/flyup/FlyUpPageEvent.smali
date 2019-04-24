.class public Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;
.super Ljava/lang/Object;
.source "FlyUpPageEvent.java"


# instance fields
.field private eventId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEventId()I
    .locals 1

    .line 10
    iget v0, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;->eventId:I

    return v0
.end method

.method public setEventId(I)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;->eventId:I

    return-void
.end method

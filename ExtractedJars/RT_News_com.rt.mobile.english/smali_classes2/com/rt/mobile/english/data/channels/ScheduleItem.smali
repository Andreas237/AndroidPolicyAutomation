.class public Lcom/rt/mobile/english/data/channels/ScheduleItem;
.super Ljava/lang/Object;
.source "ScheduleItem.java"


# instance fields
.field private time:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDate()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/ScheduleItem;->time:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/rt/mobile/english/data/channels/ScheduleItem;->title:Ljava/lang/String;

    return-object v0
.end method

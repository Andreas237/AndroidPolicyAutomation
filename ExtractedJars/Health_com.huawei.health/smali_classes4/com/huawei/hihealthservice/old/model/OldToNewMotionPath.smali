.class public Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final HEARTRATElIST_TAG:Ljava/lang/String; = "tp=h-r"

.field public static final LBSDATAMAP_TAG:Ljava/lang/String; = "tp=lbs"

.field public static final PACEMAP_TAG:Ljava/lang/String; = "tp=p-m"

.field public static final SPORT_TYPE_BADMINTON:I = 0x10c

.field public static final SPORT_TYPE_BASKETBALL:I = 0x10f

.field public static final SPORT_TYPE_BIKE:I = 0x103

.field public static final SPORT_TYPE_BODY_BUILDING:I = 0x116

.field public static final SPORT_TYPE_CLIMB_HILL:I = 0x104

.field public static final SPORT_TYPE_CLIMB_STAIRS:I = 0x105

.field public static final SPORT_TYPE_CROSS_COUNTRY_RACE:I = 0x118

.field public static final SPORT_TYPE_DEFAULT:I = 0x0

.field public static final SPORT_TYPE_ELLIPTICAL_MACHINE:I = 0x111

.field public static final SPORT_TYPE_FOOTBALL:I = 0x10e

.field public static final SPORT_TYPE_GOLF:I = 0x107

.field public static final SPORT_TYPE_INDOOR_BIKE:I = 0x109

.field public static final SPORT_TYPE_OPEN_AREA_SWIM:I = 0x10a

.field public static final SPORT_TYPE_OTHER_SPORT:I = 0x117

.field public static final SPORT_TYPE_PILATES:I = 0x115

.field public static final SPORT_TYPE_PINGPONG:I = 0x10b

.field public static final SPORT_TYPE_ROW_MACHINE:I = 0x112

.field public static final SPORT_TYPE_RUN:I = 0x102

.field public static final SPORT_TYPE_SWIM:I = 0x106

.field public static final SPORT_TYPE_TENNIS:I = 0x10d

.field public static final SPORT_TYPE_TREADMILL:I = 0x108

.field public static final SPORT_TYPE_TREAD_MACHINE:I = 0x113

.field public static final SPORT_TYPE_VOLLEYBALL:I = 0x110

.field public static final SPORT_TYPE_WALK:I = 0x101

.field public static final SPORT_TYPE_YOGA:I = 0x114

.field public static final STEPRATElIST_TAG:Ljava/lang/String; = "tp=s-r"

.field public static final VERSION:Ljava/lang/String; = "version=1001"


# instance fields
.field private heartRateList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;>;"
        }
    .end annotation
.end field

.field private lbsDataMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;[D>;"
        }
    .end annotation
.end field

.field private paceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHeartRateList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;>;"
        }
    .end annotation

    .line 175
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->heartRateList:Ljava/util/List;

    return-object v0
.end method

.method public getLbsDataMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Long;[D>;"
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->lbsDataMap:Ljava/util/Map;

    return-object v0
.end method

.method public getPaceMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;"
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->paceMap:Ljava/util/Map;

    return-object v0
.end method

.method public setHeartRateList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;>;)V"
        }
    .end annotation

    .line 180
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->heartRateList:Ljava/util/List;

    .line 181
    return-void
.end method

.method public setLbsDataMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;[D>;)V"
        }
    .end annotation

    .line 160
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->lbsDataMap:Ljava/util/Map;

    .line 161
    return-void
.end method

.method public setPaceMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 170
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->paceMap:Ljava/util/Map;

    .line 171
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 185
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 186
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 188
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 190
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 192
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->lbsDataMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->lbsDataMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 194
    const-string v0, "tp=lbs"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "lat="

    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [D

    const/4 v2, 0x0

    aget-wide v1, v1, v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "lon="

    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [D

    const/4 v2, 0x1

    aget-wide v1, v1, v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "alt="

    .line 197
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [D

    const/4 v2, 0x2

    aget-wide v1, v1, v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 198
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 200
    goto/16 :goto_0

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->paceMap:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 203
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->paceMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 204
    const-string v0, "tp=p-m"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 206
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 208
    goto :goto_1

    .line 210
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->heartRateList:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 211
    const/4 v9, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->heartRateList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 212
    const-string v0, "tp=h-r"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";k="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->heartRateList:Ljava/util/List;

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;->getTime()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "v="

    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/OldToNewMotionPath;->heartRateList:Ljava/util/List;

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/unite/MotionPathHeartRate;->getHeartRate()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 214
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->setLength(I)V

    .line 211
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 219
    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 220
    invoke-virtual {v7, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 221
    goto :goto_3

    .line 222
    :cond_3
    const-string v0, "OldToNewMotionPath"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "toString totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

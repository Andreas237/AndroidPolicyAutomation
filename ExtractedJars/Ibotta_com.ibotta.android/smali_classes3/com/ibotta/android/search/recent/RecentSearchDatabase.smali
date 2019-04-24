.class public abstract Lcom/ibotta/android/search/recent/RecentSearchDatabase;
.super Landroid/arch/persistence/room/RoomDatabase;
.source "RecentSearchDatabase.java"


# annotations
.annotation build Landroid/arch/persistence/room/Database;
    entities = {
        Lcom/ibotta/android/search/recent/RecentSearchTerm;
    }
    exportSchema = false
    version = 0x1
.end annotation

.annotation build Landroid/arch/persistence/room/TypeConverters;
    value = {
        Lcom/ibotta/android/search/recent/Category;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/arch/persistence/room/RoomDatabase;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getRecentSearchTermDao()Lcom/ibotta/android/search/recent/RecentSearchTermDao;
.end method

.class Lcom/launchdarkly/android/UserLocalSharedPreferences;
.super Ljava/lang/Object;
.source "UserLocalSharePreferences.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/launchdarkly/android/UserLocalSharedPreferences$FloatSharedPreferencesEntry;,
        Lcom/launchdarkly/android/UserLocalSharedPreferences$StringSharedPreferencesEntry;,
        Lcom/launchdarkly/android/UserLocalSharedPreferences$BooleanSharedPreferencesEntry;,
        Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntry;,
        Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;,
        Lcom/launchdarkly/android/UserLocalSharedPreferences$EntryComparator;
    }
.end annotation


# static fields
.field private static final MAX_USERS:I = 0x5


# instance fields
.field private final activeUserSharedPrefs:Landroid/content/SharedPreferences;

.field private final application:Landroid/app/Application;

.field private currentUserSharedPrefs:Landroid/content/SharedPreferences;

.field private final listeners:Lcom/google/common/collect/Multimap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/Multimap<",
            "Ljava/lang/String;",
            "Landroid/util/Pair<",
            "Lcom/launchdarkly/android/FeatureFlagChangeListener;",
            "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;",
            ">;>;"
        }
    .end annotation
.end field

.field private mobileKey:Ljava/lang/String;

.field private final usersSharedPrefs:Landroid/content/SharedPreferences;


# direct methods
.method constructor <init>(Landroid/app/Application;Ljava/lang/String;)V
    .locals 2

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->application:Landroid/app/Application;

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LaunchDarkly-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-users"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->usersSharedPrefs:Landroid/content/SharedPreferences;

    .line 50
    iput-object p2, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->mobileKey:Ljava/lang/String;

    .line 51
    invoke-direct {p0}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->loadSharedPrefsForActiveUser()Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->activeUserSharedPrefs:Landroid/content/SharedPreferences;

    .line 52
    invoke-static {}, Lcom/google/common/collect/HashMultimap;->create()Lcom/google/common/collect/HashMultimap;

    move-result-object p1

    .line 53
    invoke-static {p1}, Lcom/google/common/collect/Multimaps;->synchronizedMultimap(Lcom/google/common/collect/Multimap;)Lcom/google/common/collect/Multimap;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    return-void
.end method

.method private deleteSharedPreferences(Ljava/lang/String;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    .line 124
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->loadSharedPrefsForUser(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 125
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 126
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 127
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 129
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->application:Landroid/app/Application;

    invoke-virtual {v2}, Landroid/app/Application;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/shared_prefs/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->sharedPrefsKeyForUser(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".xml"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string p1, "Deleting SharedPrefs file:%s"

    const/4 v1, 0x1

    .line 130
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, v1}, Ltimber/log/Timber;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-void
.end method

.method private getAllUsers()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->usersSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    .line 91
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 93
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 95
    :try_start_0
    iget-object v5, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->usersSharedPrefs:Landroid/content/SharedPreferences;

    const-wide/high16 v6, -0x8000000000000000L

    invoke-interface {v5, v2, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "Found user: %s"

    .line 96
    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-static {v2, v6}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->userAndTimeStampToHumanReadableString(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v4

    invoke-static {v5, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Unexpected type! This is not good"

    .line 98
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 102
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 103
    new-instance v1, Lcom/launchdarkly/android/UserLocalSharedPreferences$EntryComparator;

    invoke-direct {v1, p0}, Lcom/launchdarkly/android/UserLocalSharedPreferences$EntryComparator;-><init>(Lcom/launchdarkly/android/UserLocalSharedPreferences;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 104
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 105
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    const-string v5, "Found sorted user: %s"

    .line 106
    new-array v6, v3, [Ljava/lang/Object;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-static {v7, v8}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->userAndTimeStampToHumanReadableString(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v4

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object v1
.end method

.method private loadSharedPrefsForActiveUser()Landroid/content/SharedPreferences;
    .locals 4

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LaunchDarkly-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->mobileKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-active"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Using SharedPreferences key for active user: [%s]"

    const/4 v2, 0x1

    .line 138
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->application:Landroid/app/Application;

    invoke-virtual {v1, v0, v3}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method private loadSharedPrefsForUser(Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 4

    const-string v0, "Using SharedPreferences key: [%s]"

    const/4 v1, 0x1

    .line 80
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->sharedPrefsKeyForUser(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->application:Landroid/app/Application;

    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->sharedPrefsKeyForUser(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v3}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method private removeCurrentUserFlag(Ljava/lang/String;)V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ApplySharedPref"
        }
    .end annotation

    .line 258
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->currentUserSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 259
    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->currentUserSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    .line 261
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 262
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 263
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 265
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 266
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v4, "Deleting key: [%s] CurrentUser value: [%s]"

    const/4 v5, 0x2

    .line 267
    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    aput-object v3, v5, v2

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 271
    :cond_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method private sharedPrefsKeyForUser(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LaunchDarkly-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->mobileKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-user"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static userAndTimeStampToHumanReadableString(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;
    .locals 3

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] timestamp: ["

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "] ["

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p0, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method deleteCurrentUserFlag(Ljava/lang/String;)V
    .locals 3

    const-string v0, "Request to delete key: [%s]"

    const/4 v1, 0x1

    .line 250
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->removeCurrentUserFlag(Ljava/lang/String;)V

    return-void
.end method

.method getCurrentUserSharedPrefs()Landroid/content/SharedPreferences;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->currentUserSharedPrefs:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method getListener(Ljava/lang/String;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Collection<",
            "Landroid/util/Pair<",
            "Lcom/launchdarkly/android/FeatureFlagChangeListener;",
            "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;",
            ">;>;"
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    monitor-enter v0

    .line 144
    :try_start_0
    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    invoke-interface {v1, p1}, Lcom/google/common/collect/Multimap;->get(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 145
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method logCurrentUserFlags()V
    .locals 7

    .line 238
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->currentUserSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    .line 239
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v0, "found zero saved feature flags"

    .line 240
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    const-string v1, "Found %s feature flags:"

    const/4 v3, 0x1

    .line 242
    new-array v4, v3, [Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v1, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v4, "\tKey: [%s] value: [%s]"

    const/4 v5, 0x2

    .line 244
    new-array v5, v5, [Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v5, v3

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method patchCurrentUserFlags(Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;)V
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->currentUserSharedPrefs:Landroid/content/SharedPreferences;

    invoke-virtual {p1, v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;->update(Landroid/content/SharedPreferences;)V

    return-void
.end method

.method registerListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
    .locals 4

    .line 149
    new-instance v0, Lcom/launchdarkly/android/UserLocalSharedPreferences$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/launchdarkly/android/UserLocalSharedPreferences$1;-><init>(Lcom/launchdarkly/android/UserLocalSharedPreferences;Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V

    .line 158
    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    monitor-enter v1

    .line 159
    :try_start_0
    iget-object v2, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    new-instance v3, Landroid/util/Pair;

    invoke-direct {v3, p2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v2, p1, v3}, Lcom/google/common/collect/Multimap;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    const-string p1, "Added listener. Total count: [%s]"

    const/4 p2, 0x1

    .line 160
    new-array p2, p2, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    invoke-interface {v3}, Lcom/google/common/collect/Multimap;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, p2, v2

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    iget-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->activeUserSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void

    :catchall_0
    move-exception p1

    .line 161
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method saveCurrentUserFlags(Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;)V
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->currentUserSharedPrefs:Landroid/content/SharedPreferences;

    invoke-virtual {p1, v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences$SharedPreferencesEntries;->clearAndSave(Landroid/content/SharedPreferences;)V

    return-void
.end method

.method setCurrentUser(Lcom/launchdarkly/android/LDUser;)V
    .locals 4

    .line 61
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getSharedPrefsKey()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->loadSharedPrefsForUser(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->currentUserSharedPrefs:Landroid/content/SharedPreferences;

    .line 63
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->usersSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 64
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getSharedPrefsKey()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-interface {v0, p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 65
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 67
    :goto_0
    iget-object p1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->usersSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    const/4 v0, 0x5

    if-le p1, v0, :cond_0

    .line 68
    invoke-direct {p0}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->getAllUsers()Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    .line 69
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v2, "Exceeded max # of users: [%s] Removing user: [%s]"

    const/4 v3, 0x2

    .line 70
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    const/4 v0, 0x1

    aput-object p1, v3, v0

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-direct {p0, p1}, Lcom/launchdarkly/android/UserLocalSharedPreferences;->deleteSharedPreferences(Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->usersSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 73
    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 74
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method syncCurrentUserToActiveUser()V
    .locals 12

    .line 194
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->activeUserSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 195
    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->activeUserSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    .line 196
    iget-object v2, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->currentUserSharedPrefs:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v2

    .line 198
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 199
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    .line 200
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v8, "key: [%s] CurrentUser value: [%s] ActiveUser value: [%s]"

    const/4 v9, 0x3

    .line 201
    new-array v9, v9, [Ljava/lang/Object;

    aput-object v4, v9, v6

    aput-object v7, v9, v5

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x2

    aput-object v10, v9, v11

    invoke-static {v8, v9}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    instance-of v8, v7, Ljava/lang/Boolean;

    if-eqz v8, :cond_1

    .line 203
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 204
    move-object v8, v7

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-interface {v0, v4, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v8, "Found new boolean flag value for key: [%s] with value: [%s]"

    .line 205
    new-array v9, v11, [Ljava/lang/Object;

    aput-object v4, v9, v6

    aput-object v7, v9, v5

    invoke-static {v8, v9}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 207
    :cond_1
    instance-of v8, v7, Ljava/lang/Float;

    if-eqz v8, :cond_2

    .line 208
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 209
    move-object v8, v7

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-interface {v0, v4, v8}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    const-string v8, "Found new numeric flag value for key: [%s] with value: [%s]"

    .line 210
    new-array v9, v11, [Ljava/lang/Object;

    aput-object v4, v9, v6

    aput-object v7, v9, v5

    invoke-static {v8, v9}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 212
    :cond_2
    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_3

    .line 213
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 214
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-interface {v0, v4, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v8, "Found new json or string flag value for key: [%s] with value: [%s]"

    .line 215
    new-array v9, v11, [Ljava/lang/Object;

    aput-object v4, v9, v6

    aput-object v7, v9, v5

    invoke-static {v8, v9}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_3
    const-string v8, "Found some unknown feature flag type for key: [%s] with value: [%s]"

    .line 218
    new-array v9, v11, [Ljava/lang/Object;

    aput-object v4, v9, v6

    aput-object v7, v9, v5

    invoke-static {v8, v9}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 224
    :cond_4
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 225
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_5

    const-string v4, "Deleting value and listeners for key: [%s]"

    .line 226
    new-array v7, v5, [Ljava/lang/Object;

    aput-object v3, v7, v6

    invoke-static {v4, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 228
    iget-object v4, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    monitor-enter v4

    .line 229
    :try_start_0
    iget-object v7, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    invoke-interface {v7, v3}, Lcom/google/common/collect/Multimap;->removeAll(Ljava/lang/Object;)Ljava/util/Collection;

    .line 230
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 233
    :cond_6
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method unRegisterListener(Ljava/lang/String;Lcom/launchdarkly/android/FeatureFlagChangeListener;)V
    .locals 6

    .line 167
    iget-object v0, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    monitor-enter v0

    .line 168
    :try_start_0
    iget-object v1, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->listeners:Lcom/google/common/collect/Multimap;

    invoke-interface {v1, p1}, Lcom/google/common/collect/Multimap;->get(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 169
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 170
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    .line 171
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Lcom/launchdarkly/android/FeatureFlagChangeListener;

    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Removing listener for key: [%s]"

    const/4 v4, 0x1

    .line 172
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-static {v3, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    iget-object v3, p0, Lcom/launchdarkly/android/UserLocalSharedPreferences;->activeUserSharedPrefs:Landroid/content/SharedPreferences;

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    invoke-interface {v3, v2}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 174
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 177
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
